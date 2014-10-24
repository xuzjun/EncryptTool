package com.zx.x.EncryptToolSuit.Util;

import java.security.*;

public class Md5 {
	private String text = null;
	private String hash = null;

	public Md5() {}
	
	public Md5(String text) {
		this.text = text;
	}

	public String getMD5() {
		if (text == null)
			return null;
		else
			return makeMD5();
	}

	public String getMD5(String text) {
		this.text = text;

		if (text == null)
			return null;
		else
			return makeMD5();
	}

	private String makeMD5() {
		MessageDigest md = null;
		byte[] encryptMsg = null;

		try {
			md = MessageDigest.getInstance("MD5"); // getting a 'MD5-Instance'
			encryptMsg = md.digest(text.getBytes()); // solving the MD5-Hash
		} catch (NoSuchAlgorithmException e) {
			System.out.println("No Such Algorithm Exception!");
		}

		String swap = ""; // swap-string for the result
		String byteStr = ""; // swap-string for current hex-value of byte
		StringBuffer strBuf = new StringBuffer();

		for (int i = 0; i <= encryptMsg.length - 1; i++) {

			byteStr = Integer.toHexString(encryptMsg[i]); // swap-string for
															// current hex-value
															// of byte

			switch (byteStr.length()) {
			case 1: // if hex-number length is 1, add a '0' before
				swap = "0" + Integer.toHexString(encryptMsg[i]);
				break;

			case 2: // correct hex-letter
				swap = Integer.toHexString(encryptMsg[i]);
				break;

			case 8: // get the correct substring
				swap = (Integer.toHexString(encryptMsg[i])).substring(6, 8);
				break;
			}
			strBuf.append(swap); // appending swap to get complete hash-key
		}
		hash = strBuf.toString(); // String with the MD5-Hash

		return hash; // returns the MD5-Hash
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHash() {
		return hash;
	}
	
	public static void main(String[] args) {
		Md5 md5 = new Md5();
		md5.setText("hello");
		String s = md5.getMD5();
		System.out.println(s);
	}
}