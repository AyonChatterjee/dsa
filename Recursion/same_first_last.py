def checkEquality(s):
    return (ord(s[0]) == ord(s[len(s) - 1]))

def countSubstringWithEqualsEnds(s):
    res= 0 
    n = len(s)
    ans = []

    for i in range(n):
        for j in range(1 , n - i + 1):
            if(checkEquality(s[i : i + j])):
                res += 1
                ans.append(s[i : i + j])

    print(f"The Possible strings are : {ans}")            
    return res 


s = "abcab"
print(countSubstringWithEqualsEnds(s))