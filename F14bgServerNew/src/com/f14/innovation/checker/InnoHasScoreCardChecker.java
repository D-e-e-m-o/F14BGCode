package com.f14.innovation.checker;

import java.util.Collection;

import com.f14.innovation.InnoGameMode;
import com.f14.innovation.InnoPlayer;
import com.f14.innovation.component.InnoCard;
import com.f14.innovation.component.ability.InnoAbility;
import com.f14.innovation.param.InnoInitParam;
import com.f14.innovation.param.InnoResultParam;

/**
 * 检查是否存在计分牌
 * 
 * @author F14eagle
 *
 */
public class InnoHasScoreCardChecker extends InnoHasCardChecker {

	public InnoHasScoreCardChecker(InnoGameMode gameMode, InnoPlayer player,
			InnoInitParam initParam, InnoResultParam resultParam,
			InnoAbility ability) {
		super(gameMode, player, initParam, resultParam, ability);
	}

	@Override
	protected Collection<InnoCard> getResourceCards() {
		return this.getTargetPlayer().getScores().getCards();
	}

}
