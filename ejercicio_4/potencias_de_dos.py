def main():
    potencia = 0
    resultado = 1

    while resultado <= 100:
        print(f'2^{potencia} = {resultado}')
        potencia += 1
        resultado *= 2

if __name__ == '__main__':
    main()
