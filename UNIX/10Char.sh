echo -e "Enter String : \c"
read str
#count the character
len=`echo -n $str | wc -c`
if test $len -lt 10
then
	echo "plese Enter Minimum 10 charater....!"
else
	echo "Your String is Perfact"
fi
