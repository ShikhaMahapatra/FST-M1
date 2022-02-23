class Car:
    'This class contains details of a car'

    def __init__(self,manufacturer, model, make, transmission, color) -> None:
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    def accelerate(self):
        print(self.manufacturer,self.model,"is moving")
    def stop(self):
        print(self.manufacturer,self.model,"has stopped")
car1=Car("Tata","Nano","1998","manual","red")
car2=Car("Maruti","Breeza","2017","Manual","Black")
car3=Car("Audi","A4","2015","Automatic","White")
car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()
car3.accelerate()
car3.stop()
