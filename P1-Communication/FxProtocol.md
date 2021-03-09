# Fx Protocol
The client opens a connection with the server and *informs* the server whether it wants to *download* or *upload* a file using a *header*.

## Download
If the client wants to download a file, then the header will be as the following:
- **download[one space][file name][Line Feed]**

Upon receiving this header, the server searches for the specified file.
- If the file is not found, then the server shall reply with a header as the following:
  - **NOT[one space]FOUND[Line Feed]**
- If the file is found, then the server shall reply
  - with a header as the following:
    - **OK[one space][file size][Line Feed]**
  - followed by the bytes of the file
		
## Upload
If the client wants to upload a file, then the header will be as the following:
- **upload[one space][file name][one space][file size][Line Feed]**

After sending the header, the client shall send the bytes of the file
