def main():
    suma = 0

    for i in range(50, 201):
        if i % 2 == 0:
            suma += i

    print(f'Suma total de los números pares entre 50 y 200: {suma}')

if __name__ == '__main__':
    main()
