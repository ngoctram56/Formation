package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table
	public class RoleUtilisateur {
		
		@Id
		private Long idRu;
		private Long idUser;
		private String designation;
		
		
		
		public RoleUtilisateur() {
			super();
			// TODO Auto-generated constructor stub
		}
		public RoleUtilisateur(Long idRu, Long idUser, String designation) {
			super();
			this.idRu = idRu;
			this.idUser = idUser;
			this.designation = designation;
		}
		public Long getIdRu() {
			return idRu;
		}
		public void setIdRu(Long idRu) {
			this.idRu = idRu;
		}
		public Long getIdUser() {
			return idUser;
		}
		public void setIdUser(Long idUser) {
			this.idUser = idUser;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		@Override
		public String toString() {
			return "RoleUtilisateurDTO [idRu=" + idRu + ", idUser=" + idUser + ", designation=" + designation + "]";
		}
		
		



}
