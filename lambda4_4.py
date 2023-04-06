nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
#Imprimimos la lista original
print("Original list of integers:")
print(nums)
print("\n numbers from the said list:")
#La siguiente funcion eleva al cuadrado cada numero de la lista
#La nueva lista se guarda en square_nums
square_nums = list(map(lambda x: x**2, nums))
#Imprimimos la lista de los numeros al cuadrado
print(square_nums)
print("\n every number of the said list: ")
#Llamamos a una funcion que eleva al cubo cada numero de la lista
#La nueva lista se guarda en cube_nums
cube_nums = list(map(lambda x: x**3, nums))
#Imprimimos la nueva lista de los numeros al cubo
print(cube_nums)
