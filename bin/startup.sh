#!/bin/sh

# START JACK
/usr/bin/jackd -P99 -dalsa -dhw:UMC1820 -r48000 -p512 -n2 &
# old interface: /usr/bin/jackd -R -P 99 -T -v -ndefault -p 512 -r -T -d alsa -n 2 -r 48000 -p 512 -D -Chw:K6 -Phw:K6 &

# touchscreen
xinput --map-to-output 14 eDP-1

qjackctl &
a2jmidid -e &
pulse2 &

# Midi24 clock
~/git/midiclock/midiclock -s -t95 &


