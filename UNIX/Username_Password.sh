i=1
while [ $i -le 3 ]
	do
		echo -e "Enter the Username : \c"
		read username
	
		echo -e "Enter the Password : \c"
		read password
 
		if test $username == "sugc" -a $password == "12345"
		then
			echo "Username is : $username"
			echo "Password is : $password"
			exit
		else
			echo "Invalid Username or Password"
		fi
	i=`expr $i + 1`
done