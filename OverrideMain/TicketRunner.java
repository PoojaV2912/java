package OverrideMain;

import Overriding.Conductor;
import Overriding.Ticket;

public class TicketRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main in TicketRunner ");
				Ticket ticket=new Conductor();
				ticket.amount();
			}

		}
	