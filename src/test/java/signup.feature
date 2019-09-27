Feature: Testme App user Login signup
 Login Credentials
 
 Scenario: Login signup
 Given Enter the url "http://10.232.237.143:443/TestMeApp/login.htm"
 When user enter "<username>" as username
 When user enter "<password>" as password
 Then user Logins to Testmeapp
 When username "harry"
 When firstname "harry"
 When lastname "priya"
 When password "1234567890"
 When confirmpassword "1234567890"
 When gender 
 When email "harry123@gmail.com"
 When mobileno "9159876148"
 When dob "09/10/2000"
 When address "chennai"
 When answer "chennai"
 Then register 
 
 
 
