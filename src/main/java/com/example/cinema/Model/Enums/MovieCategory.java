package com.example.cinema.Model.Enums;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


public enum MovieCategory {
  ACTION,
  HORROR,
  COMEDY,
  ROMANCE,
  FANTASY,
  SCI_FI
}
