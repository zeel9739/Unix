echo -e "Enter the No1 : \c"
read no1
echo -e "Enter the No2 : \c"
read no2
echo "** Arithmetic Operation **"
echo "Press 1 For Addition"
echo "Press 2 For Substraction"
echo "Press 3 For Multiplication"
echo "Press 4 For Division"
echo "Press 5 For Module"
echo "**************************"

echo -e "Enter the Choice : \c"
read ch
case $ch in
 1)
	add=$(( $no1 + $no2 ))	
	echo "Addition Is : $add"
 ;;
 2)
	sub=$(( $no1 - $no2 ))
	echo "Substraction Is : $sub"
 ;;
 3)
	mul=`expr $no1 \* $no2`
	echo "Multiplication Is : $mul"
 ;;
 4)
	div=`expr $no1 / $no2`
	echo "Division Is : $div"
 ;;
 5)
	mod=$(( $no1 % $no2 ))
	echo "Module Is : $mod"
 ;;
 *)
	echo "Wrong Choice"
 ;;
esac