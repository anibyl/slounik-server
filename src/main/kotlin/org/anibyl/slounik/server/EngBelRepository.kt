package org.anibyl.slounik.server

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * @author Usievaład Kimajeŭ
 * @created 23.12.2017
 */
@Repository
interface EngBelRepository : CrudRepository<EngBelEntity, Long> {
	fun findByTitle(title: String): List<EngBelEntity>
}
