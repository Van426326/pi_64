#!/usr/bin/env bash

#得到进程ID pid，kill该进程
pid=`cat pid`
if [ -n "$pid" ]
then
    echo "kill -9 的pid:" $pid
    kill -9 $pid
fi
echo "pi64服务关闭成功"

#执行jar，并将进程挂起，保存进程ID到 pid文件
nohup java -Xms128m -Xmx128m -Xmn64m -jar -Duser.timezone=GMT+8 target/pi-0.0.1.jar --spring.profiles.active=$1 > log.log 2>&1 & echo "$!" > pid
echo "pi64服务启动成功"
