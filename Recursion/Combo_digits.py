def generateCombination(input , ind , curr , res):
    if ind == len(input):
        res.append(curr)
        return 
    
    # to pick the element 
    generateCombination(input , ind  + 1 , curr + input[ind] , res)

    # to not the pick element
    generateCombination(input , ind  + 1 , curr , res)

    return res

input = "123"
res = []
combinations = generateCombination(input , 0 , "", res)
print("Combinations: " ,combinations)


# Output : Combinations:  ['123', '12', '13', '1', '23', '2', '3', '']

