def main():
    print("Digite acontinuación 3 números:")
    
    n1 = None
    n2 = None
    n3 = None
    resultado = None
    
    try:
        n1 = int(input())
        n2 = int(input())
        n3 = int(input())
        
        if n1 > 0:
            resultado = n2 * n3
        else:
            resultado = n2 + n3
        print(resultado)
    except ValueError:
        print('Numero invalido')


if __name__ == '__main__':
    main()
    