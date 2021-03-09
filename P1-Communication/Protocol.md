# Protocol
The client opens a connection with the server and *informs* the server whether it wants to *download* or *upload* a file using a header:
1. If the client wants to download a file, then the header will be as the following:
download[one space][file name][Line Feed]
	2.2-Upon receiving this header, the server searches for the specified file
2.3-If the file is not found then the server shall reply with a header as the following:
		NOT[one space]FOUND[Line Feed]
