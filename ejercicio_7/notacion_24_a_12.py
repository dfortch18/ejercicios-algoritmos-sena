def main():
    hora24 = None
    hora12 = None
    periodo = None
    
    try:
        print("Digite la hora en formato 24 horas:")
        hora24 = int(input())
        
        while hora24 < 0 or hora24 >= 24:
            print("Hora inválida, vuelva a digitarla")
            hora24 = int(input())
        
        if hora24 < 12:
            periodo = "a.m."
        else:
            periodo = "p.m."
        
        if hora24 == 0:
            hora12 = 12;
        elif hora24 > 12:
            hora12 = hora24 - 12
        else:
            hora12 = hora24
            
        print("La hora en notación 12 horas es: ", hora12, " ", periodo)
    except ValueError:
        print("Hora invalida")

if __name__ == '__main__':
    main()