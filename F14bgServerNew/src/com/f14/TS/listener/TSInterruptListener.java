package com.f14.TS.listener;

import com.f14.F14bg.consts.CmdConst;
import com.f14.F14bg.network.CmdFactory;
import com.f14.TS.TSGameMode;
import com.f14.TS.TSPlayer;
import com.f14.bg.action.BgResponse;
import com.f14.bg.exception.BoardGameException;
import com.f14.bg.listener.ListenerType;
import com.f14.bg.player.Player;

/**
 * TS的中断监听器(所有玩家同时执行)
 * 
 * @author F14eagle
 *
 */
public abstract class TSInterruptListener extends TSActionListener {
	protected TSPlayer trigPlayer;

	/**
	 * 构造函数
	 * 
	 * @param trigPlayer 触发该监听器的玩家
	 */
	public TSInterruptListener(TSPlayer trigPlayer){
		super(ListenerType.INTERRUPT);
		this.trigPlayer = trigPlayer;
	}
	
	/**
	 * 取得提示文本
	 * 
	 * @param player
	 * @return
	 */
	protected String getMsg(Player player){
		return "";
	}
	
	/**
	 * 取得选择行动字符串
	 * 
	 * @return
	 */
	protected String getActionString(){
		return "";
	}
	
	@Override
	protected BgResponse createStartListenCommand(TSGameMode gameMode,
			Player player) {
		BgResponse res = super.createStartListenCommand(gameMode, player);
		res.setPublicParameter("msg", this.getMsg(player));
		//设置行动字符串
		res.setPublicParameter("actionString", this.getActionString());
		return res;
	}
	
	@Override
	protected void setListenerInfo(BgResponse res) {
		super.setListenerInfo(res);
		//设置触发玩家的位置参数
		res.setPublicParameter("trigPlayerPosition", this.trigPlayer.position);
	}
	
	/**
	 * 刷新玩家的当前提示信息
	 * 
	 * @param player
	 * @throws BoardGameException 
	 */
	public void refreshMsg(TSGameMode gameMode, Player player) throws BoardGameException{
		BgResponse res = CmdFactory.createGameResponse(CmdConst.GAME_CODE_REFRESH_MSG, player.position);
		res.setPublicParameter("msg", this.getMsg(player));
		gameMode.getGame().sendResponse(player, res);
	}
	
}
