h=$(date +"%H")
if [ $h -gt 6 -a $h -le 12 ]
then
 echo "good morning"
elif [ $h -gt 12 -a $h -le 16 ]
then
 echo "good afternoon"
elif [ $h -gt 16 -a $h -le 20 ]
then
 echo "good evening"
elif [ $h -gt 20 -a $h -le 24 ]
then
 echo "good night"
elif [ $h -gt 1 -a $h -le 6 ]
then
 echo "good night"
else
 echo "Invalid Hour"
fi
