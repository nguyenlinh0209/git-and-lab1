package com.example.myapplication

class SquareCabin(override val buildingMaterial: String) : Dwelling() {
    override fun floorArea(): Double {
        return floorArea() * floors
    }
}

