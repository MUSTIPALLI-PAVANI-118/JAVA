from trains import trains
from passenger import Passenger

bookings = {}
pnr_number = 1000


def book_ticket():
    global pnr_number

    train_no = int(input("Enter Train Number: "))

    for train in trains:

        if train["train_no"] == train_no:

            if train["seats"] > 0:

                name = input("Enter Passenger Name: ")
                age = int(input("Enter Age: "))
                gender = input("Enter Gender: ")

                passenger = Passenger(name, age, gender)

                pnr_number += 1
                train["seats"] -= 1

                bookings[pnr_number] = {
                    "passenger": passenger,
                    "train": train
                }

                print("\nTicket Booked Successfully!")
                print("PNR Number:", pnr_number)
                print("Train:", train["train_name"])
                print("Fare:", train["fare"])

            else:
                print("No Seats Available!")

            return

    print("Train Not Found!")
