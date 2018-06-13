package org.anibyl.slounik.server

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.AUTO
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author Usievaład Kimajeŭ
 * @created 23.12.2017
 */
@Entity
@Table(name = "engbel")
class EngBelEntity {
	@Id @GeneratedValue(strategy = AUTO) var id: Int = 0
	var title: String = ""
	var description: String = ""
}
