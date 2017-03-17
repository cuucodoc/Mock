package model.bean;

public class KhungGioBean {

		private String maThoiGian;
		private String thoiGian;
		private float giaTriTinh;
		/**
		 * @return the maThoiGian
		 */
		public String getMaThoiGian() {
			return maThoiGian;
		}
		/**
		 * @param maThoiGian the maThoiGian to set
		 */
		public void setMaThoiGian(String maThoiGian) {
			this.maThoiGian = maThoiGian;
		}
		/**
		 * @return the thoiGian
		 */
		public String getThoiGian() {
			return thoiGian;
		}
		/**
		 * @param thoiGian the thoiGian to set
		 */
		public void setThoiGian(String thoiGian) {
			this.thoiGian = thoiGian;
		}
		/**
		 * @return the giaTriTinh
		 */
		public float getGiaTriTinh() {
			return giaTriTinh;
		}
		/**
		 * @param giaTriTinh the giaTriTinh to set
		 */
		public void setGiaTriTinh(float giaTriTinh) {
			this.giaTriTinh = giaTriTinh;
		}
		/**
		 * @param maThoiGian
		 * @param thoiGian
		 * @param giaTriTinh
		 */
		public KhungGioBean(String maThoiGian, String thoiGian, float giaTriTinh) {
			super();
			this.maThoiGian = maThoiGian;
			this.thoiGian = thoiGian;
			this.giaTriTinh = giaTriTinh;
		}
		public KhungGioBean() {
			super();
		} 
		
	}
