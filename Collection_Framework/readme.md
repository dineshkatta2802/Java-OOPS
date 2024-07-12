<h1>⁡⁣⁢⁣Collection Framework⁡</h1>
The Collection in java is a framework that provides a collection of Objects.<br>
we can perform several operations like adding, removing, deleting, and  modifying.<br>
It is Implemented by java.util.package.<br>


<h2>⁡⁣⁢⁣Hierarchy of Collection Framework⁡</h2>
<img src="https://static.javatpoint.com/images/java-collection-hierarchy.png" alt="Hierarchy of Collection framework 1" width="854" height="715">
<br>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20230406131807/Collections-in-Java.webp" alt="Hierarchy of Collection Framework2" width="689" height="300">

<ol>
<li><b>⁡⁢⁣⁣Sets:⁡</b></li>
<ol>
<li>As Set repersent a group of data just like an array</li>
<li>Set will grow dynamically when the elemants are stored in it</li>
<li><b>No duplicate elements</b> are allowed</li>
<li>No positional Access</li>
<li><b>Implementations:</b> HashSet, LinkedHashSet, TreeSet.</li>
</ol>
<hr>
<li><b>⁡⁢⁣⁣Queue:⁡</b></li>
<ol>
<li>As the name itsel suggest that it follows the <b>FIFO(First-In-First-Out)</b> order</li>
<li><b>Implementations:</b> PriorityQueue, ArrayDeque.</li>
</ol>
<hr>
<li><b>⁡⁢⁣⁣⁡⁢⁣⁣Lists:⁡⁡</b></li>
<ol>
<li>They are similar to Sets but the only difference is that they <b>allow  duplicate elements</b></li>
</ol>
<hr>
<li><b>⁡⁢⁣⁣Maps:⁡</b></li>
<ol>
<li>Maps stores elements in the form of <b>keys and values</b></li>
<li>Of course the key has <b>unique value</b></li>
<li>No direct relation to Collection interface.</li>
<li><b>Implementations:</b> HashMap, LinkedHashMap, TreeMap, Hashtable, ConcurrentHashMap.</li>
</ol>
</ol>
<hr>
<h2>⁡⁣⁢⁣How to choose the right Collection framework?⁡</h2>
<b>⁡⁢⁣⁣List:⁡</b>
 When you need an ordered collection allowing duplicates.<br>
<b>⁡⁢⁣⁣Set:⁡</b>
 When you need a collection with unique elements.<br>
<b>⁡⁢⁣⁣Queue:⁡</b>
 When you need a collection following FIFO.<br>
<b>⁡⁢⁣⁣Deque:⁡</b>
 When you need a collection that allows element addition/removal from both ends.<br>
<b>⁡⁢⁣⁣Map:⁡</b> 
When you need a key-value pair association.<br>

<h2>⁡⁣⁢⁣Methods of the Collections Interface⁡</h2>
<table><thead><tr><th style="width: 350px;"><p dir="ltr" style="text-align: center;"><span>Method</span></p>
</th><th style="width: 350px;"><p dir="ltr" style="text-align: center;"><span>Description</span></p>
</th></tr></thead><tbody><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/collection-add-method-in-java-with-examples/" rel="noopener" previewlistener="true"><b><strong>add(Object)</strong></b></a></td><td style="width: 350px;"><span>This method is used to add an object to the collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/collections-addall-method-in-java-with-examples/" rel="noopener" previewlistener="true"><b><strong>addAll(Collection c)</strong></b></a></td><td style="width: 350px;"><span>This method adds all the elements in the given collection to this collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/collection-clear-method-in-java-with-examples/" rel="noopener" previewlistener="true"><b><strong>clear()</strong></b></a></td><td style="width: 350px;"><span>This method removes all of the elements from this collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/collection-contains-method-in-java-with-examples/" rel="noopener" previewlistener="true"><b><strong>contains(Object o)</strong></b></a></td><td style="width: 350px;"><span>This method returns true if the collection contains the specified element.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/java-collection-containsall-method/" rel="noreferrer noopener" previewlistener="true"><b><strong>containsAll(Collection c)</strong></b></a></td><td style="width: 350px;"><span>This method returns true if the collection contains all of the elements in the given collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/equals-hashcode-methods-java/" rel="noopener" previewlistener="true"><b><strong>equals(Object o)</strong></b></a></td><td style="width: 350px;"><span>This method compares the specified object with this collection for equality.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/equals-hashcode-methods-java/" rel="noopener" previewlistener="true"><b><strong>hashCode()</strong></b></a></td><td style="width: 350px;"><span>This method is used to return the hash code value for this collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/collection-isempty-method-in-java-with-examples/" rel="noopener" previewlistener="true"><b><strong>isEmpty()</strong></b></a></td><td style="width: 350px;"><span>This method returns true if this collection contains no elements.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/iterators-in-java/" rel="noopener" previewlistener="true"><b><strong>iterator()</strong></b></a></td><td style="width: 350px;"><span>This method returns an iterator over the elements in this collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/collections-max-method-in-java-with-examples/" rel="noopener" previewlistener="true"><b><strong>max()</strong></b></a><span>&nbsp;</span><br><span>&nbsp;</span></td><td style="width: 350px;"><span>This method is used to return the maximum value present in the collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/what-is-java-parallel-streams/" rel="noopener" previewlistener="true"><b><strong>parallelStream()</strong></b></a></td><td style="width: 350px;"><span>This method returns a parallel Stream with this collection as its source.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/java-program-to-remove-a-specific-element-from-a-collection/" rel="noopener" previewlistener="true"><b><strong>remove(Object o)</strong></b></a></td><td style="width: 350px;"><span>This method is used to remove the given object from the collection. If there are duplicate values, then this method removes the first occurrence of the object.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/java-collection-removeall-method/" rel="noreferrer noopener" previewlistener="true"><b><strong>removeAll(Collection c)</strong></b></a></td><td style="width: 350px;"><span>This method is used to remove all the objects mentioned in the given collection from the collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/java-collection-removeif-method/" rel="noreferrer noopener" previewlistener="true"><b><strong>removeIf(Predicate filter)</strong></b></a></td><td style="width: 350px;"><span>This method is used to remove all the elements of this collection that satisfy the given </span><a href="https://www.geeksforgeeks.org/mathematic-logic-predicates-quantifiers/" rel="noopener" previewlistener="true"><span>predicate</span></a><span>.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/java-collection-retainall-method/" rel="noreferrer noopener" previewlistener="true"><b><strong>retainAll(Collection c)</strong></b></a></td><td style="width: 350px;"><span>This method is used to retain only the elements in this collection that are contained in the specified collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/how-to-get-a-size-of-collection-in-java/" rel="noopener" previewlistener="true"><b><strong>size()</strong></b></a></td><td style="width: 350px;"><span>This method is used to return the number of elements in the collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/java-collection-spliterator-with-examples/" rel="noreferrer noopener" previewlistener="true"><b><strong>spliterator()</strong></b></a></td><td style="width: 350px;"><span>This method is used to create a </span><a href="https://www.geeksforgeeks.org/java-program-to-convert-iterator-to-spliterator/" rel="noopener" previewlistener="true"><span>Spliterator</span></a><span> over the elements in this collection.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/stream-in-java/" rel="noopener" previewlistener="true"><b><strong>stream()</strong></b></a></td><td style="width: 350px;"><span>This method is used to return a sequential Stream with this collection as its source.</span></td></tr><tr><td style="width: 350px;"><a href="https://www.geeksforgeeks.org/arraylist-toarray-method-in-java-with-examples/" rel="noopener" target="_blank" previewlistener="true"><b><strong>toArray()</strong></b></a></td><td style="width: 350px;"><span>This method is used to return an array containing all of the elements in this collection.</span></td></tr></tbody></table>

