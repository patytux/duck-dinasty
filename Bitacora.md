Commit - Add fly method for all ducks

    La herencia no soluciona el problema debido a que hizo que el codigo sea rigido haciendo que se tenga que sobreescribir algunos metodos que no cumplen con la funcionalidad requerida para ciertas clases patos

Commit - Add Flyable and Quackable interfaces

    Con la implementacion de las interfaces Flyable y Quackable se soluciona parte del problema pero aparece la Inmovilidad teniendo codigo duplicado en las clases patos.

Commit - Implement duck behavior

    Al implementar duck's behaviors estamos encapsulando la funcionalidad que tiende a variar y haciedo uso de composicion en lugar de herencia, de este modo despues podemos hacer cambios o añadir nuevos comportamientos sin necesidad de afectar la funcionalidad actual o tocar alguna de las clases patos, sin embargo estamos todavia acoplados a las implementaciones de las interfaces de comportamiento en el constructor de las clases patos.

Commit - Set behavior dynamically

    Finalmente estamos permitiendo que el comportamiento se pueda cambiar dinamicamente al añadir setters para que estos comportamientos puedan ser modificado en tiempo de ejecucion y asi lograr desacoplar las clases pato de los comportamientos. 


