/**
 * 
 */
package com.github.emalock3.lombok.example;

import lombok.Value;
import lombok.experimental.Builder;

/**
 * ふーclass
 * 
 * @author emalock3
 */
@Value
@Builder
public class Foo {
	/**
	 * アイディー abc12345
	 * 
	 * @return ID あいうえお
	 */
	String id;
	/**
	 * 名前 foofoo
	 * 
	 * @return barbar名前
	 */
	String name;
	/**
	 * 値段 12345
	 * 
	 * @return 値段1234
	 */
	int price;
}
