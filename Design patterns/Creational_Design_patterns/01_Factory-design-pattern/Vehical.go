package Creational_DP

import (
	"errors"
	"fmt"
	"strings"
)

type Vehical interface {
	Start()
	Stop()
}

// Now all the structs are implementing Vehical as thay all are implementing all methods of Vehical interface
// Car
type Car struct{}

func (Car) Start() {
	fmt.Println("Car is starting")
}

func (Car) Stop() {
	fmt.Println("Car is Stoping")
}

// Truck
type Truck struct{}

func (Truck) Start() {
	fmt.Println("Truck is starting")
}

func (Truck) Stop() {
	fmt.Println("Truck is Stoping")
}

// Bike
type Bike struct{}

func (Bike) Start() {
	fmt.Println("Bike is starting")
}

func (Bike) Stop() {
	fmt.Println("Bike is Stoping")
}

// Vehical factory --> Manages the creation of different part of the objects of vehicals
func VehicalFactory(vehicalType string) (Vehical, error) {
	switch strings.ToLower(vehicalType) {
	case "car":
		return Car{}, nil
	case "truck":
		return Truck{}, nil
	case "bike":
		return Bike{}, nil
	default:
		return nil, errors.New("Unknown vehical type")
	}
}

//Client code just providing the string for which vehical he want's to create and vehicalFactory will create it in abstract maner

func main() {
	vehicalType := []string{"car", "bike", "truck"}
	for _, v := range vehicalType {
		vehical, err := VehicalFactory(v)
		if err != nil {
			fmt.Println(err)
			return
		}
		vehical.Start()
		vehical.Stop()
	}
}
