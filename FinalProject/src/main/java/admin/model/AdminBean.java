package admin.model;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * AdminBean 클래스
 * 호텔 서비스를 관리하는 관리자 정보를 저장하는 엔티티
 * 테이블: ADMIN
 */

public class AdminBean {
	
		private final String must = "필수 입력 사항입니다.";
		
		private int admin_id;              // 관리자 고유 식별자
		
		@NotEmpty(message = must)
	    private String username;         // 로그인에 사용되는 관리자 아이디
	    
		@NotEmpty(message = must)
		private String password;           // 암호화된 비밀번호
	    
	    private String email;             // 관리자 이메일 주소
	    
	    @NotEmpty(message = must)
	    private String permissionLevel;   // 관리자 권한 수준 ('manager', 'super')
	    
	 // 기본 생성자
	    public AdminBean() {}
	    
	    /**
	     * 모든 필드를 초기화하는 생성자
	     */
	    public AdminBean(int admin_id, String username, String password, String email, String permissionLevel) {
	        this.admin_id = admin_id;
	        this.username = username;
	        this.password = password;
	        this.email = email;
	        this.permissionLevel = permissionLevel;
	    }

		public int getAdmin_id() {
			return admin_id;
		}

		public void setAdmin_id(int admin_id) {
			this.admin_id = admin_id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPermissionLevel() {
			return permissionLevel;
		}

		public void setPermissionLevel(String permissionLevel) {
			this.permissionLevel = permissionLevel;
		}
	    
}