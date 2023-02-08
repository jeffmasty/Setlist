# resample to 48k
for i in *.wav; do ffmpeg -i "$i" -sample_fmt s16 -ar 48000 "${i%.*}48.wav"; done
