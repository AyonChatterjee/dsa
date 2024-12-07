def generate_permutations(input , ind , res):
    
    # Convert String to list for mutability
    input = list(input)

    # Base case:
    if ind == len(input):
        res.append("".join(input))
        return res
    
    for i in range(ind , len(input)):
        # swap ind with i 
        input[ind] , input[i] = input[i] , input[ind]

        # Recurse for the next index
        generate_permutations(input , ind + 1 , res)

        # backtrack
        input[ind] , input[i] = input[i] , input[ind]

    return res 

input_string = "123"
res = []
Permutations = generate_permutations(input_string , 0 , res)
print("Permutations:" , Permutations) 

# Output : Permutations: ['123', '132', '213', '231', '321', '312']