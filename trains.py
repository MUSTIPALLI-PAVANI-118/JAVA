trains = [
    {
        "train_no": 12601,
        "train_name": "Chennai Mail",
        "source": "Chennai",
        "destination": "Delhi",
        "seats": 50,
        "fare": 1500
    },
    {
        "train_no": 12602,
        "train_name": "Mumbai Express",
        "source": "Chennai",
        "destination": "Mumbai",
        "seats": 40,
        "fare": 1200
    },
    {
        "train_no": 12603,
        "train_name": "Bangalore Express",
        "source": "Chennai",
        "destination": "Bangalore",
        "seats": 60,
        "fare": 500
    }
]


def display_trains():
    print("\nAvailable Trains")

    for train in trains:
        print("-------------------------")
        print("Train Number:", train["train_no"])
        print("Train Name:", train["train_name"])
        print("Source:", train["source"])
        print("Destination:", train["destination"])
        print("Available Seats:", train["seats"])
        print("Ticket Fare:", train["fare"])
