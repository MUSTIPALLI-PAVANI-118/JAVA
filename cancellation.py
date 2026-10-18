from booking import bookings


def cancel_ticket():

    pnr = int(input("Enter PNR Number: "))

    if pnr in bookings:

        booking = bookings[pnr]

        booking["train"]["seats"] += 1

        del bookings[pnr]

        print("\nTicket Cancelled Successfully!")
        print("PNR Number:", pnr)

    else:
        print("Invalid PNR Number!")
