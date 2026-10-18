from trains import display_trains
from booking import book_ticket, bookings
from cancellation import cancel_ticket


def check_pnr():

    pnr = int(input("Enter PNR Number: "))

    if pnr in bookings:

        booking = bookings[pnr]

        print("\nTicket Details")
        print("PNR Number:", pnr)

        booking["passenger"].display_details()

        print("Train:", booking["train"]["train_name"])
        print("Status: Confirmed")

    else:
        print("PNR Not Found!")


while True:

    print("\n====== IRCTC RAILWAY RESERVATION ======")
    print("1. View Available Trains")
    print("2. Book Ticket")
    print("3. Check PNR Status")
    print("4. Cancel Ticket")
    print("5. Exit")

    choice = input("Enter Your Choice: ")

    if choice == "1":
        display_trains()

    elif choice == "2":
        book_ticket()

    elif choice == "3":
        check_pnr()

    elif choice == "4":
        cancel_ticket()

    elif choice == "5":
        print("Thank You for Using IRCTC!")
        break

    else:
        print("Invalid Choice!")
