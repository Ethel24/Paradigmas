nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
#Imprimimos la lista original
print("Original list of integers:")
print(nums)
print("\n numbers from the said list:")
#Se llama a la función filter() junto con lambda que devuelve True si un número es par y False si es impar
#La lsita nueva se guarda en la variable even_nums
even_nums = list(filter(lambda x: x%2 == 0, nums))
#Imprimimos la lista de números pares
print(even_nums)
print("\n numbers from the said list: ")
#La funcion devuelve True si un número es impar y False si es par. 
#La lista nueva se guarda en odd_nums
odd_nums = list(filter(lambda x: x%2 != 0, nums))
#Imprimimos la lista de números impares
print(odd_nums)
