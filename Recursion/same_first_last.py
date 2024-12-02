def countSubstringWithEqualsEnds(s , i , j , n):

    # base case
   if(n == 1):
      if s[i : j + 1] not in ans:
       ans.append(s[i : j + 1])
      return 1
   
   if(n <= 0):
      return 0
   

   res = (countSubstringWithEqualsEnds(s , i + 1 , j , n - 1) 
       + countSubstringWithEqualsEnds(s , i , j - 1, n - 1)
       - countSubstringWithEqualsEnds(s , i + 1 , j - 1 , n - 2)) 
   

   if(s[i] == s[j]) and s[i : j + 1] not in ans:
       res+= 1
       ans.append(s[i : j + 1])

   return res  


s = "abcab"
n = len(s)
ans = []

print(countSubstringWithEqualsEnds(s , 0 , n - 1 , n))

print(f"The combinations are : {ans}")
