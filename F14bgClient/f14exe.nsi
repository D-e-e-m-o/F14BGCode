Name "F14bg"
Caption "F14bg"
Icon "F14.ico"
OutFile "F14bg.exe"

SilentInstall silent
AutoCloseWindow true
ShowInstDetails nevershow

Section ""
    Exec "javaw -cp ./lib/F14bgClient.jar;./lib/F14bgUpdate.jar;./;./conf/;./lib/cn.smartinvoke.jar;./lib/commons-beanutils.jar;./lib/commons-collections-3.2.1.jar;./lib/commons-dbcp-1.1.jar;./lib/commons-digester.jar;./lib/commons-fileupload-1.2.1.jar;./lib/commons-io-1.4.jar;./lib/commons-jexl-1.0.jar;./lib/commons-lang-2.0.jar;./lib/commons-logging.jar;./lib/commons-pool-1.1.jar;./lib/ezmorph-1.0.5.jar;./lib/flex-messaging-common.jar;./lib/flex-messaging-core.jar;./lib/json-lib-2.2.2-jdk15.jar;./lib/log4j-1.2.8.jar;./lib/netty-3.1.5.GA.jar;./lib/swt.jar com.f14.F14bgClient.F14bgClient"
SectionEnd