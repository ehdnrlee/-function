package kr.co.pro.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	String id;
	String pwd;
	String irum;
	String pNumber;
	String email;
}
