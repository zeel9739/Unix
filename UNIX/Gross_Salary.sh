echo -e "Enter the Basic Salary : \c"
read bsalary
# pf = 10%
# dp = 50%
# da = 35%
# ma = 3%
# hra = 8%
if test $bsalary -gt 0
then
	dp=$((($bsalary*50)/100))
	echo "DP : $dp"
	
	da=$(((($bsalary*35)/100) + $dp))
	echo "DA : $da"
 
	ma=$(((($bsalary*3)/100) + $dp))
	echo "MA : $ma"
 
	hra=$(((($bsalary*8)/100) + $dp))
	echo "HRA : $hra"
 
	pf=$(((($bsalary*10)/100) + $dp))
	echo "PF : $pf"
 
	gsalary=$(($bsalary + $dp + $da + $hra + $ma - $pf))
	echo "Gross Salary : $gsalary"
else
	echo "Enter Valid Salary"
fi
