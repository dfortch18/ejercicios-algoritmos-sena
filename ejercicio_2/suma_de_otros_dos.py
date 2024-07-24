def main():
    n1 = None
    n2 = None
    n3 = None
    suma = None
    sumando1 = None
    sumando2 = None
    
    print('Digite a continuación 3 números:')
    
    try:
        n1 = int(input())
        n2 = int(input())
        n3 = int(input())
        
        if n1 == n2 + n3:
            suma = n1
            sumando1 = n2
            sumando2 = n3
        elif n2 == n1 + n3:
            suma = n2
            sumando1 = n1
            sumando2 = n3
        elif n3 == n1 + n2:
            suma = n3
            sumando1 = n1
            sumando2 = n2
            
        print(f'El número {suma} es la suma de {sumando1} + {sumando2}')
    except ValueError:
        print('Número invalido')

if __name__ == '__main__':
    main()