#El programa ordena los datos de las tuplas por el segundo elemento que es la calificacion
subject_marks = [('English', 88), ('Science', 90), ('Maths', 97), ('Social sciences', 82)]
#Se imprime la lista original conforme fueron ingresados los datos
print("Original list of tuples:")
print(subject_marks)
#Se utiliza la funcion sort para ordenar los datos
#por medio de la funcion lambda se indica que tomaremos el segundo elemento de la tupla
subject_marks.sort(key = lambda x: x[1])
#Se imprime la lista ordenada
print("\nResult:")
print(subject_marks)