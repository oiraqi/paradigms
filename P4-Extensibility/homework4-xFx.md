# Homework 4 - xFx
## Description
Reusing the RESTful service developed in [Homework 3](../P3-Performance/homework"-xFx.md), and *based on the background acquired in Part 4*, develop a Browser-based HTML/JavaScript client that displays the content of the remote shared folder, each *n* seconds, *n* being an input parameter.

For simplicity, we will only consider depth 0, i.e., we will ignore the content of subfolders. So, if and only if any file or subfolder directly under the remote shared folder is created, deleted or renamed, then such a change should be tracked and displayed by by the client.

More specifically, the end user shall be able to:
- input *n* in a text field
- click a button to start receiving remote content updates each *n* seconds, and update the local content display (inside the browser) accordingly
- click the same button, whose caption should have changed from *start* to *stop*, to stop receiving remote content updates

### Deliverables
One zip file containing:
1. Technology enablers: **25%**
2. Solution description: **25%**
3. JavaScript code: **40%**
4. HTML code: **10%**

You may want to use [Rx-Http-Request](https://www.npmjs.com/package/@akanass/rx-http-request)
