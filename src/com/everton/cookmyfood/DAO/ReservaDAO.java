package com.everton.cookmyfood.DAO;

import com.everton.cookmyfood.Models.Reserva;

public class ReservaDAO extends GenericDAO<Reserva> {

	@Override
	public Class getEntityClass() {
		return Reserva.class;
	}

}
