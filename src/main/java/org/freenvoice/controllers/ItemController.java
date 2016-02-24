package org.freenvoice.controllers;

import java.util.List;

import org.freenvoice.models.Item;
import org.freenvoice.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemRepository repo;

	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public List<Item> findItems() {
		return repo.findAll();
	}

	@RequestMapping(value = "/items",method = RequestMethod.POST)
	public Item addItem(@RequestBody Item item) {
		item.setId(null);
		return repo.saveAndFlush(item);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Item getItem(@PathVariable Integer id) {
		Item ret = repo.getOne(id);
		
		return ret;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Item updateItem(@RequestBody Item updatedItem, @PathVariable Integer id) {
		updatedItem.setId(id);
		return repo.saveAndFlush(updatedItem);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteItem(@PathVariable Integer id) {
		repo.delete(id);
	}
}