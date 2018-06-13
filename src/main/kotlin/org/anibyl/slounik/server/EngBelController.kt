package org.anibyl.slounik.server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author Usievaład Kimajeŭ
 * @created 23.12.2017
 */
@RestController
@RequestMapping("/engbel")
class EngBelController(val repository: EngBelRepository) {
	@GetMapping("/{title}")
	fun getArticle(
			@PathVariable title: String, @RequestParam(name = "d", defaultValue = "false") searchInDescription: Boolean
	): List<EngBelEntity> {
		return repository.findByTitle(title)
	}
}
