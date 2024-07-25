def main():
    suma = 0
    iteraciones = 0
    
    for i in range(1, 100):
        if i % 3 == 0:
            suma += i;
            if iteraciones < 5:
                print(f'{i} --------> {suma}')
            else:
                if iteraciones == 5:
                    print('------------------')
                print(i)
            iteraciones += 1
    print(f'Suma total: {suma}')
    
if __name__ == '__main__':
    main()