# give Jack permission to use linux realtime system

/sbin/setcap cap_ipc_lock,cap_sys_nice=ep /usr/bin/jackd
