/**
 * 
 */
package com.github.emalock3.lombok.example;

import lombok.Data;

/**
 * ばーclass
 * 
 * @author emalock3
 */
@Data
public class Bar {
	/**
	 * foo ふー
	 * 
	 * @return fooおぶじぇくと
	 */
	private final Foo foo;
	/**
	 * IDあいでぃー
	 * 
	 * @param id あたらしいあいでぃー
	 * @return あいでぃー
	 */
	private String id;
	/**
	 * なまえname
	 * 
	 * @param name あたらしいなまえ
	 * @return なまえ
	 */
	private String name;
	/**
	 * すこあ
	 * 
	 * @param score あたらしい得点
	 * @return とくてん
	 */
	private double score;
}
