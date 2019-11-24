package com.dbs.homeloan.util;

import java.nio.charset.StandardCharsets;
import java.security.Security;

import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.examples.ByteArrayHandler;
import org.bouncycastle.util.encoders.Hex;

public class PGPUtil {
	private static final String SYMMETRIC_KEY = "sdhfsyfgeoifsdcobsifgefbbsdbbsdskfhgdf";

	public static String encrypt(String stringToEncrypt) {
		Security.addProvider(new BouncyCastleProvider());
		Security.setProperty("crypto.policy", "unlimited");
		try {
			return new String(Hex.encode(ByteArrayHandler.encrypt(stringToEncrypt.getBytes(StandardCharsets.UTF_8), 
					SYMMETRIC_KEY.toCharArray(), null, SymmetricKeyAlgorithmTags.AES_256, false)));
		} catch (Exception e) {
			throw new IllegalStateException("Error while Encrypting (bcpgp) : " + e.getMessage(), e);
		}
	}
	
	public static String decrypt(String stringToDecrypt) {
		Security.addProvider(new BouncyCastleProvider());
		Security.setProperty("crypto.policy", "unlimited");
		try
		{
			return new String(ByteArrayHandler.decrypt(Hex.decode(stringToDecrypt.getBytes()), SYMMETRIC_KEY.toCharArray()));
		} catch (Exception e) {
			throw new IllegalStateException("Error while Decrypting (bcpgp) : " + e.getMessage(), e);
		}
	}
}
