#!/bin/sh

# touchscreen
xinput --map-to-output 14 eDP-1

# Midi24 clock
/home/judah/git/midiclock/midiclock -s -t95 &

# connect midiclock to DI (5din to Crave Synth)
aconnect 128:0 24:0
# connect midiclock to MPK Arp
aconnect 128:0 44:0

# START JACK
jackd -P99 -dalsa -dhw:UMC1820 -r48000 -p512 -n2 
# old interface: /usr/bin/jackd -R -P 99 -T -v -ndefault -p 512 -r -T -d alsa -n 2 -r 48000 -p 512 -D -Chw:K6 -Phw:K6 &

#qjackctl &
#a2jmidid -e &
#pulse2 &




