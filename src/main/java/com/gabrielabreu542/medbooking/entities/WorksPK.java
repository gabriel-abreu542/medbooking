package com.gabrielabreu542.medbooking.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Embeddable
public class WorksPK {
		
		@ManyToOne
		@JoinColumn(name = "medic_id")
		Medic medic;
		
		@ManyToOne
		@JoinColumn(name = "hospital_id")
		Hospital hospital;
		
		public WorksPK() {
			
		}

		@Override
		public int hashCode() {
			return Objects.hash(medic, hospital);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			WorksPK other = (WorksPK) obj;
			return Objects.equals(medic, other.medic) && Objects.equals(hospital, other.hospital);
		}


		public WorksPK(Medic medic, Hospital hospital) {
			super();
			this.medic = medic;
			this.hospital = hospital;
		}
		
	}

}
