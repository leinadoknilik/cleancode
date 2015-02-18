package com;

public class Status {
	private int id;
	private boolean checked;
	private boolean onTable;

	public Status(int id, boolean checked, boolean onTable) {
		super();
		this.id = id;
		this.checked = checked;
		this.onTable = onTable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public boolean isOnTable() {
		return onTable;
	}

	public void setOnTable(boolean onTable) {
		this.onTable = onTable;
	}

}
